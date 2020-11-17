import React from "react";
//import axios from "axios";

// // import '../user.min.css'

// class User extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = { users: [] };
//     this.userName = React.createRef();
//   }

//   componentDidMount() {
//     this.getData();
//   }

//   getData = () => {
//     // Java Spring Boot uses port 8080
//     let url = "http://localhost:8080/users";

//     // C# dotnetcore uses port 5000
//     //let url = "http://localhost:5000/projects";

//     // Express uses port 3001 (react uses 3000)
//     // let url = "http://localhost:3001/tasks";
//     axios.get(url).then(response => this.setState({ users: response.data }));
//   };

//   addUser = () => {
//     let url = "http://localhost:8080/users";
//     axios.post(url, { name: this.userName.current.value }).then(response => {
//       // refresh the data
//       this.getData();
//       // empty the input
//       this.userName.current.value = "";
//     });
//   };


//   render() {
//     return (
//       <div>
//         <h3>List of guests</h3>
//         <input ref={this.userName} />
//         <button type="button" className="btn btn-primary" onClick={this.addUser}>add</button>
//         <ul>
//           {this.state.users.map(p => (
//             <li key={p.userid}>
//               {p.name} : { p.complete ? "complete" : "not complete" } <button type="button" className="btn btn-success">Complete</button><button type="button" className="btn btn-danger">Delete</button>
//             </li>
//           ))}
//         </ul>
//       </div>
//     );
//   }
// }
class User extends React.Component {
  constructor(props) {
    super(props);
    this.state = { items: [], text: '' };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  render() {
    return (
      <div>
        <h3>Guests</h3>
        <UserList items={this.state.items} />
        <form onSubmit={this.handleSubmit}>
          <label htmlFor="new-user">
            What needs to be done?
          </label>
          <input
            id="new-user"
            onChange={this.handleChange}
            value={this.state.text}
          />
          <button>
            Add #{this.state.items.length + 1}
          </button>
        </form>
      </div>
    );
  }

  handleChange(e) {
    this.setState({ text: e.target.value });
  }

  handleSubmit(e) {
    e.preventDefault();
    if (this.state.text.length === 0) {
      return;
    }
    const newItem = {
      text: this.state.text,
      id: Date.now()
    };
    this.setState(state => ({
      items: state.items.concat(newItem),
      text: ''
    }));
  }
}

class UserList extends React.Component {
  render() {
    return (
      <ul>
        {this.props.items.map(item => (
          <li key={item.id}>{item.text}</li>
        ))}
      </ul>
    );
  }
}
ReactDOM.render(
  <User />,
  document.getElementById('todos-example')
);

export default User;