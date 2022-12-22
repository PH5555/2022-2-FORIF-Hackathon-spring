import React from "react";
import styled from "styled-components";

const Button = ({ onClick, children }) => {
  return <Container onClick={() => onClick()}>{children}</Container>;
};

const Container = styled.div`
  background-color: #e7ded0;
  width: 326px;
  height: 60px;
  margin-left: 22px;
  border-radius: 20px;
  color: black;
  font-size: 20px;
  justify-content: center;
  align-items: center;
  display: flex;
  margin-bottom: 16px;
  cursor: pointer;
`;

export default Button;
