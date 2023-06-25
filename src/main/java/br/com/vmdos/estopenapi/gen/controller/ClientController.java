package br.com.vmdos.estopenapi.gen.controller;

import br.com.vmdos.estopenapi.gen.dto.ClientRequestDto;
import br.com.vmdos.estopenapi.gen.dto.ClientResponseDto;
import br.com.vmdos.estopenapi.gen.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(produces = "application/json")
    public ResponseEntity<ClientResponseDto> add(@RequestBody ClientRequestDto usuarioDto) {

        return ResponseEntity.ok(clientService.save(usuarioDto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<ClientResponseDto> get(@PathVariable Long id) {

        return ResponseEntity.ok().build();
    }

}