import React from "react";
import Input from "../../components/Input";
import styled from "styled-components";
import Button from "../../components/Button";

const LoginPresenter = ({
  enterRoom,
  createRoom,
  onRoomIdChange,
  onNameChange,
  roomId,
  name,
}) => {
  return (
    <Container>
      <Image src="/asset/image/person.jpeg" />
      <Text>우리 지금 만나</Text>
      <Input
        hint={"방 id를 입력해주세요!"}
        onChange={onRoomIdChange}
        text={roomId}
      />
      <Input
        hint={"이름을 입력해주세요!"}
        onChange={onNameChange}
        text={name}
      />
      <Button onClick={enterRoom}>입장하기</Button>
      <Button onClick={createRoom}>방 만들기</Button>
    </Container>
  );
};

const Container = styled.div`
  justify-content: center;
  align-items: center;
  display: flex;
  flex-direction: column;
`;

const Text = styled.p`
  font-size: 50px;
  font-weight: bold;
  color: white;
  margin: 0;
  margin-bottom: 36px;
  margin-left: 22px;
`;

const Image = styled.img`
  width: 200px;
  height: 200px;
  border-radius: 30px;
  margin-bottom: 18px;
  margin-top: 30px;
  margin-left: 22px;
`;

export default LoginPresenter;
