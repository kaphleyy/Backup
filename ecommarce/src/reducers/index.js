import counterReducer from "./counterReducer";
import loggedReducer from "./isLogged";
import { combineReducers } from "redux";

const allReducers = combineReducers({
  counter: counterReducer, //! can be anything in the place of counter
  isLogged: loggedReducer,
});

export default allReducers;
