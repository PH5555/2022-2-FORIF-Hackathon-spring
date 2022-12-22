import React, { useCallback } from "react";
import LoginPresenter from "./LoginPresenter";

const LoginContainer = () => {
  const enterRoom = useCallback(() => {
    console.log("enter room");
  }, []);

  const createRoom = useCallback(() => {
    console.log("create room");
  }, []);

  const props = {
    enterRoom: enterRoom,
    createRoom: createRoom,
  };

  return <LoginPresenter {...props} />;
};

export default LoginContainer;
