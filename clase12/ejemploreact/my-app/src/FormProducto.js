import React, { Component } from "react";
import axios from 'axios';

class FormProducto extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
          campoNombre: '',
          campoPrecio: 0,
          idProducto: null
        }
    }

    componentDidMount() {

    }

    eventoEnviarDatos = (e) => {
      e.preventDefault();
      const producto = {
        nombre: this.state.campoNombre,
        precio: this.state.campoPrecio
      };

      let url = 'http://localhost:8080/api/v1/productos';

      if(this.state.idProducto != null && this.state.idProducto > 0) {
        url = url + '/' + this.state.idProducto;
        axios.put(url, producto).then(res => {
          this.setState({ idProducto: res.data.id });
          if(this.props.onAltaDeProducto != null) {
            this.props.onAltaDeProducto(res.data.id);
          }
      });


      } else {
        axios.post(url, producto).then(res => {
          this.setState({ idProducto: res.data.id });
          if(this.props.onAltaDeProducto != null) {
            this.props.onAltaDeProducto(res.data.id);
          }
       });

      }
      

    };

    render() {
      return <form onSubmit={(e) => this.eventoEnviarDatos(e) }>
        <div>
          <label>Id</label>
          <input type="text" onChange={(e) => this.setState({ idProducto: e.target.value })}  value={this.state.idProducto} />
        </div>
        <div>
          <label>Nombre</label>
          <input type="text" onChange={(e) => this.setState({ campoNombre: e.target.value })} />
        </div>
        <div>
          <label>Precio</label>
          <input type="number" onChange={(e) => this.setState({ campoPrecio: e.target.value })} />
        </div>
        <button type="submit">Enviar datos</button>
      </form>;
    }

}

export default FormProducto;