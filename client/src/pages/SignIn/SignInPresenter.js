import React from "react";
import Input from "../../components/Input";
import styled from "styled-components";
import Button from "../../components/Button";

const SignInPresenter = ({
  createRoom,
  closeDialog,
  onRoomNameChange,
  roomName,
  isVisible,
  roomId,
}) => {
  return (
    <Container>
      <Image src="/asset/image/person.jpeg" />
      <Text>우리 지금 만나</Text>
      <Input
        hint={"방 이름을 입력해주세요!"}
        onChange={onRoomNameChange}
        text={roomName}
      />
      <Button onClick={createRoom}>방 만들기</Button>
      {isVisible ? (
        <Modal>
          <SmallText> 방 id: {roomId}</SmallText>
          <SmallText> 친구들에게 공유해주세요!</SmallText>
          <ModalBtn onClick={() => closeDialog()}>확인</ModalBtn>
        </Modal>
      ) : null}
    </Container>
  );
};

const Modal = styled.div`
  width: 310px;
  height: 172px;
  background-color: #efefef;
  border-radius: 20px;
  justify-content: center;
  align-items: center;
  display: flex;
  flex-direction: column;
  position: absolute;
  margin-left: 22px;
  margin-top: 100px;
`;

const SmallText = styled.p`
  margin: 0;
  font-size: 16px;
  font-weight: bold;
  color: ${(props) => props.color || "black"};
  margin-bottom: 10px;
`;

const ModalBtn = styled.div`
  background-color: #e7ded0;
  border-radius: 10px;
  justify-content: center;
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: 16px;
  width: 110px;
  height: 40px;
  cursor: pointer;
`;

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
  margin-left: 22px;
  margin-bottom: 36px;
`;

const Image = styled.img`
  width: 200px;
  height: 200px;
  margin-left: 22px;

  border-radius: 30px;
  margin-bottom: 18px;
  margin-top: 30px;
`;

export default SignInPresenter;
