import React from 'react';
import './App.css';

const App = () => {
  const heading = "Office Space";

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "https://images.unsplash.com/photo-1497215728101-856f4ea42174?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Bangalore",
      Image: "https://images.unsplash.com/photo-1497366811353-6870744d04b2?q=80&w=1169&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
    }
  ];

  return (
    <div>
      <h1><b>{heading} , at Affordable Range</b></h1>

      {officeList.map((item, index) => {
        const colorClass = item.Rent <= 60000 ? "textRed" : "textGreen";

        return (
          <div key={index}>
            <img src={item.Image} width="20%" height="20%" alt={item.Name} />
            <h1><b>Name: {item.Name}</b></h1>
            <h3 className={colorClass}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
            <hr />
          </div>
        );
      })}
    </div>
  );
};

export default App;
