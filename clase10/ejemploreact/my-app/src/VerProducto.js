import React, { Component } from "react";
import axios from 'axios';

class VerProducto extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            producto: null,
        }
    }

    // Se ejecuta cuando se carga el componente. Por el momento cuando se carga nuestro listado
    componentDidMount() {

    }

    actualizarProducto(idProducto) {
        const url = 'http://localhost:8080/api/v1/productos/' + idProducto;
        axios.get(url).then(res => {
            this.setState({ producto: res.data });
        });
    }

    render() {
        const producto = this.state.producto;

        if(producto != null) {
            return <div>
                <div>Id: <b>{producto.id}</b></div>
                <div>Nombre: <b>{producto.nombre}</b></div>
                <div>Precio: <b>{producto.precio}</b></div>
            </div>;
        }
        return <div>Sin producto por el momento...</div>;
    }

}

export default VerProducto;