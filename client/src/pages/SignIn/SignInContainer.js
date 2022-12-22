import React, { useCallback, useState } from "react";
import SignInPresenter from "./SignInPresenter";
import { useNavigate } from "react-router-dom";

const SignInContainer = () => {
  const navigate = useNavigate();
  const [isVisible, setIsVisible] = useState(false);
  const [roomName, setRoomName] = useState("");
  const [roomId, setRoomId] = useState(0);

  const onRoomNameChange = (e) => {
    setRoomName(e.target.value);
    console.log(roomName);
  };

  const createRoom = useCallback(() => {
    if (roomName == "") {
      window.alert("방 이름을 입력해 주세요!");
      return;
    }
    //생성하고 id 받아오기
    setIsVisible(true);
  }, []);

  const closeDialog = useCallback(() => {
    setIsVisible(false);
    navigate("/");
  }, [roomName]);

  const props = {
    createRoom: createRoom,
    closeDialog: closeDialog,
    onRoomNameChange: onRoomNameChange,
    roomName,
    isVisible,
    roomId,
  };

  return <SignInPresenter {...props} />;
};

export default SignInContainer;
