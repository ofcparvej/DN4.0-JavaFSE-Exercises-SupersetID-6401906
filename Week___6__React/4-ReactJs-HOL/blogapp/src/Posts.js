
import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      posts: []
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const postList = data.map(item => new Post(item.id, item.title, item.body));
        this.setState({ posts: postList });
      })
      .catch(error => {
        console.log('Error fetching posts:', error);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h2>Posts List</h2>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }

  componentDidCatch(error, info) {
    alert("An error occurred: " + error);
  }
}

export default Posts;
