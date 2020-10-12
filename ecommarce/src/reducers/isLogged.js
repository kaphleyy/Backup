const loggedReducer = (state = false, action) => {
  switch (action.type) {
    case "LOGIN":
      return true;
    case "LOGOUT":
      return false;
  }
};
export default loggedReducer;
