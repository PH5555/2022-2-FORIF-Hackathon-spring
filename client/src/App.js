import React, { useState, useEffect } from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Login from "./pages/Login/LoginContainer";
import Home from "./pages/Home/HomeContainer";
import SignIn from "./pages/SignIn/SignInContainer";

function App() {
  return (
    <div>
      <Router>
        <Routes>
          <Route path="/" element={<Login />}></Route>
          <Route path="/home" element={<Home />}></Route>
          <Route path="/sign" element={<SignIn />}></Route>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
