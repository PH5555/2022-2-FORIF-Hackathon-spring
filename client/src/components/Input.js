import React, { useState } from "react";
import styled, { css } from "styled-components";

const Input = ({ hint }) => {
  const [text, setText] = useState("");

  const onChange = (e) => {
    setText(e.target.value);
  };

  const onReset = () => {
    setText("");
  };

  return (
    <Container>
      <InputOutLine>{text === "" ? hint : text}</InputOutLine>
      <InputBox onChange={onChange} value={text}></InputBox>
    </Container>
  );
};

const InputBox = styled.input`
  width: 300px;
  height: 60px;
  position: absolute;
  opacity: 0;
`;

const Container = styled.div`
  position: relative;
  margin-bottom: 16px;
  width: 300px;
  height: 60px;
`;

const InputOutLine = styled.div`
  width: 300px;
  height: 60px;
  border-radius: 20px;
  border: 2px solid #e7ded0;
  padding-left: 22px;
  color: white;
  align-items: center;
  font-size: 16px;
  display: flex;
  position: absolute;
`;

export default Input;
