import React, { useState } from 'react';
import './App.css';

function App() {
  const [count, setCount] = useState(0);

  const incrementValue = () => {
    setCount(count + 1);
  };

  const sayHello = () => {
    alert("Hello! Member1");
  };

  const handleIncrement = () => {
    incrementValue();
    sayHello();
  };

  const handleDecrement = () => {
    setCount(count - 1);
  };

  const sayMessage = (msg) => {
    alert(msg);
  };

  const onButtonClick = () => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      {/* Left-aligned Counter Section */}
      <div style={{ marginLeft: '0px' }}>
        <h2>{count}</h2>
        <button onClick={handleIncrement}>Increment</button><br />
        <button onClick={handleDecrement}>Decrement</button><br />
        <button onClick={() => sayMessage("welcome")}>Say welcome</button><br />
        <button onClick={onButtonClick}>Click on me</button>
      </div>

      {/* Left-aligned Currency Converter */}
      <CurrencyConvertor />
    </div>
  );
}

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === "euro") {
      const converted = parseFloat(amount) * 80;
      alert(`Converting to Euro Amount is ${converted}`);
    } else {
      alert("Only Euro conversion is supported");
    }
  };

  return (
    <div style={{ marginTop: "40px", marginLeft: '0px' }}>
      <h2 style={{ color: "green", fontWeight: "bold" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div>
          <label>Currency: </label>
          <textarea
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
