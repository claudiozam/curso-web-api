import React, { Component } from "react";
import axios from 'axios';
import VerProducto from "./VerProducto";

class ListadoDeProductos extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            productos: []
        }
        this.verProductoComponent = null;
    }

    // Se ejecuta cuando se carga el componente. Por el momento cuando se carga nuestro listado
    componentDidMount() {
        const url = 'http://localhost:8080/api/v1/productos';
        axios.get(url).then(res => {
            this.setState({ productos: res.data });
        });
    }

    eventoClickVerProducto(idProducto) {
        this.verProductoComponent.actualizarProducto(idProducto);
    }

    setVerProductoRef = (e) => {
        this.verProductoComponent = e;
    };
  

    render() {
        return <div><table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                {this.state.productos.map(producto => {
                    return <tr key={producto.id}>
                            <td>{producto.id}</td>
                            <td>{producto.nombre}</td>
                            <td>{producto.precio}</td>
                            <td><button type="button" onClick={() => this.eventoClickVerProducto(producto.id)}>Ver</button></td>
                        </tr>;
                })}
            </tbody>
        </table>
        <VerProducto ref={this.setVerProductoRef}></VerProducto>
        </div>;
    }

}

export default ListadoDeProductos;