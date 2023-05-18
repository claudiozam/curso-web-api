import React, { Component } from "react";
import axios from 'axios';

class FormProducto extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
          campoNombre: '',
          campoPrecio: 0
        }
    }

    componentDidMount() {

    }

    eventoEnviarDatos = (e) => {
      e.preventDefault();
      const producto = {
        nombre: this.state.nombre,
        precio: this.state.precio
      };

      //TODO: HACER LA LLAMADA POST AL API!!!
    };

    render() {
      return <form onSubmit={(e) => this.eventoEnviarDatos(e) }>
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