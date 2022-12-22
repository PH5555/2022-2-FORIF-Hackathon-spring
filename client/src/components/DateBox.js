import React from "react";
import styled from "styled-components";

const DateBox = ({ selected, index, onClick, children }) => {
  return (
    <Container selected={selected} onClick={() => onClick(index)}>
      <Date>{index}</Date>
      <Text>{children}</Text>
    </Container>
  );
};

const Container = styled.div`
  width: 140px;
  height: 100px;
  background-color: ${(props) => (props.selected ? "#E7DED0" : "")};
  border: 2px solid #e7ded0;
  cursor: pointer;
`;

const Text = styled.p`
  margin: 0;
  color: white;
  font-size: 16px;
  margin-left: 10px;
  font-weight: bold;
`;

const Date = styled.p`
  margin: 0;
  color: white;
  font-size: 16px;
  margin-left: 10px;
  margin-top: 8px;
  margin-bottom: 14px;
`;

export default DateBox;
