import React, { Component } from "react";
import axios from 'axios';

class HolaMundo extends React.Component {


    constructor(props) {
        super(props);
        //Init del state
        this.state = {
            contador: 0,
            producto: null
        };

        console.log('Creando una nueva instancia del componente HolaMundo');
        this.eventoClickSumarContador = this.eventoClickSumarContador.bind(this);
    }

    componentDidMount() {
        console.log('El componente hola mundo ya se mostra en la pagina...');

        const url = 'http://localhost:8080/api/v1/productos/1';
        axios.get(url).then(res => {
            console.log(res.data);
            this.setState({ producto: res.data });

        });

    }

    componentWillUnmount() {
        console.log('El componente hola mundo ya se esta borrando de la pagina...');
    }

    eventoClickSumarContador() {
        const valorActual = this.state.contador;
        this.setState({ contador:  valorActual + 1 });
    }

    renderDatosDeProducto(producto) {
        if(producto != null) {
            return <div>Datos del producto: {producto.nombre}</div>;
        }
        return null;
    }

    render() {

        return <div>
                    <h1>Hola a todos!!! me llamo {this.props.nombre} y mi edad es {this.props.edad}</h1>
                    <b>Valor del contado: {this.state.contador}</b>
                    {this.renderDatosDeProducto(this.state.producto)}
                    <button type="button" onClick={this.eventoClickSumarContador}>Sumar 1 al contador</button>
                </div>;
    }

}

export default HolaMundo;