import { useEffect, useState } from "react";
import axios from "axios";

function FakePostList() {
  const [posts, setPosts] = useState([]);
  const [filtered, setFiltered] = useState([]);
  const [category, setCategory] = useState("all");

  const fetchData = async () => {
    try {
      const res = await axios.get("https://dummyjson.com/posts");
      setPosts(res.data.posts);
      setFiltered(res.data.posts);
    } catch (err) {
      console.log(err);
    }
  };

  useEffect(() => {
    fetchData();
  }, []);

  const handleFilter = (value) => {
    setCategory(value);

    if (value === "all") {
      setFiltered(posts);
    } else {
      const filteredData = posts.filter(
        (post) => post.userId === parseInt(value)
      );
      setFiltered(filteredData);
    }
  };

  return (
    <div>
      <h2>Fake API Posts</h2>

      <button onClick={fetchData}>Refresh</button>

      <br /><br />

      <select onChange={(e) => handleFilter(e.target.value)}>
        <option value="all">All</option>
        <option value="1">User 1</option>
        <option value="2">User 2</option>
        <option value="3">User 3</option>
      </select>

      {filtered.map((post) => (
        <div key={post.id}>
          <h4>{post.title}</h4>
          <p>{post.body}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default FakePostList;