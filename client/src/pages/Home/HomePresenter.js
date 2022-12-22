import React from "react";
import styled from "styled-components";
import Button from "../../components/Button";
import DateBox from "../../components/DateBox";

const HomePresenter = ({ selectDate, dateArr, addDate, calculateDate }) => {
  return (
    <Container>
      <Text>모임 이름</Text>
      <Calendar>
        {[...new Array(31)].map((e, index) => {
          return (
            <DateBox
              selected={dateArr.indexOf(index + 1) !== -1}
              index={index + 1}
              onClick={selectDate}
            />
          );
        })}
      </Calendar>
      <BtnCover>
        <Button onClick={addDate}>추가하기</Button>
        <Button onClick={calculateDate}>계산하기</Button>
      </BtnCover>
    </Container>
  );
};

const Container = styled.div`
  justify-content: center;
  align-items: center;
  display: flex;
  flex-direction: column;
`;

const BtnCover = styled.div`
  justify-content: center;
  align-items: center;
  display: flex;
`;

const Calendar = styled.div`
  width: 1100px;
  justify-content: flex-start;
  align-items: center;
  display: flex;
  flex-wrap: wrap;
  margin-bottom: 30px;
`;

const Text = styled.p`
  margin: 0;
  font-weight: bold;
  font-size: 40px;
  margin-top: 30px;
  margin-bottom: 40px;
  color: white;
`;

export default HomePresenter;
