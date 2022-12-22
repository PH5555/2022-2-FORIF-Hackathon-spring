import React, { useCallback, useState } from "react";
import LoginPresenter from "./LoginPresenter";
import { useNavigate } from "react-router-dom";

const LoginContainer = () => {
  const navigate = useNavigate();
  const [roomId, setRoomId] = useState("");
  const [name, setName] = useState("");

  const onRoomIdChange = (e) => {
    setRoomId(e.target.value);
    console.log(roomId);
  };

  const onNameChange = (e) => {
    setName(e.target.value);
  };

  const enterRoom = useCallback(() => {
    if (roomId == "") {
      window.alert("방 id를 입력해주세요");
      return;
    }
    if (name == "") {
      window.alert("이름을 입력해주세요");
      return;
    }
    navigate("/home");
  }, [roomId, name]);

  const createRoom = useCallback(() => {
    navigate("/sign");
  }, []);

  const props = {
    enterRoom: enterRoom,
    createRoom: createRoom,
    onRoomIdChange: onRoomIdChange,
    onNameChange: onNameChange,
    roomId,
    name,
  };

  return <LoginPresenter {...props} />;
};

export default LoginContainer;
