import React, { Component } from "react";
import axios from 'axios';

class ListadoDeProductos extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            productos: []
        }
    }

    componentDidMount() {
        const url = 'http://localhost:8080/api/v1/productos';
        axios.get(url).then(res => {
            this.setState({ productos: res.data });
        });
    }

    render() {
        return <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                </tr>
            </thead>
            <tbody>
                {this.state.productos.map(producto => {
                    return <tr key={producto.id}><td>{producto.id}</td><td>{producto.nombre}</td><td>{producto.precio}</td></tr>;
                })}
            </tbody>
        </table>;
    }

}

export default ListadoDeProductos;