import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";
import { books, blogs, courses } from "./data";
import './App.css'; // Make sure this is imported

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  return (
    <div className="container">
      {/* Conditional using && operator */}
      {showCourses && (
        <div className="section">
          <h1>Course Details</h1>
          <CourseDetails courses={courses} />
        </div>
      )}

      {/* Conditional using ternary */}
      <div className="section">
        <h1>Book Details</h1>
        {showBooks ? <BookDetails books={books} /> : <p>No books</p>}
      </div>

      {/* Conditional using function */}
      <div className="section">
        <h1>Blog Details</h1>
        {renderBlogs(showBlogs)}
      </div>
    </div>
  );
}

function renderBlogs(show) {
  if (!show) return <p>No blogs</p>;
  return <BlogDetails blogs={blogs} />;
}

export default App;
