import React, { useCallback, useState } from "react";
import HomePresenter from "./HomePresenter";

const HomeContainer = () => {
  const [dateArr, setDateArr] = useState([]);

  const selectDate = useCallback(
    (id) => {
      const index = dateArr.indexOf(id);
      if (index === -1) {
        setDateArr([id, ...dateArr]);
      } else {
        console.log("check");
        setDateArr([...dateArr.filter((e) => e !== id)]);
      }
    },
    [dateArr]
  );

  const addDate = useCallback(() => {
    if (dateArr.length === 0) {
      window.alert("선택된 날짜가 없습니다!");
      return;
    }
    setDateArr([]);
    window.alert("추가되었습니다!");
  }, [dateArr]);

  const calculateDate = useCallback(() => {}, []);

  const props = {
    selectDate: selectDate,
    addDate: addDate,
    calculateDate: calculateDate,
    dateArr,
  };

  return <HomePresenter {...props} />;
};

export default HomeContainer;
