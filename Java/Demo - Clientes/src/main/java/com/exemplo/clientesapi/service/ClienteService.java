package com.exemplo.clientesapi.service;

import com.exemplo.clientesapi.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final List<Cliente> lista = new ArrayList<>();
    private Long nextId = 1L;

    // Lista todos os clientes
    public List<Cliente> listar() {
        return lista;
    }

    // Cria um novo cliente
    public Cliente criar(Cliente cliente) {
        cliente.setId(nextId++);
        lista.add(cliente);
        return cliente;
    }

    // Busca cliente por ID
    public Cliente buscarPorId(Long id) {
        return lista.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Remove cliente por ID
    public boolean remover(Long id) {
        return lista.removeIf(c -> c.getId().equals(id));
    }

    // Atualiza cliente
    public Cliente atualizar(Long id, Cliente novoCliente) {

        for (int i = 0; i < lista.size(); i++) {

            Cliente cliente = lista.get(i);

            if (cliente.getId().equals(id)) {

                novoCliente.setId(id);

                lista.set(i, novoCliente);

                return novoCliente;
            }
        }

        return null;
    }
}