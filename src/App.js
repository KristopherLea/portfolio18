import logo from './logo.svg';

import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
       <h1 className="h1">Welcome to my portfolio</h1>
        <p>
         Feel free to sign my guest page.
        </p>
     <input type="text" placeholder="Enter your first name here"></input>
       <input type="text" placeholder="Enter your last name here"></input>
       <button className="button">Click here</button>
      
            <div class="container-fluid">
        <div class="navbar-header">
            <h3>Kristopher Lea</h3>
        </div>
       
        <ul class="nav navbar-nav">
          <br></br>
          <p>Here are my social media links</p>
        <div class="row">
   
 <li id="list"><a href="https://wozu.exeterlms.com/profile">Resume</a></li>
</div>

            <li id="list"><a href="https://www.linkedin.com/in/kristopher-lea-b375a3bb/">LinkedIn</a></li>
            
            
            <li id="list"><a href="https://github.com/KristopherLea">Github</a></li>      
        </ul>
    </div>
      </header>
      
    </div>
  );
}

export default App;
