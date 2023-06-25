package br.com.vmdos.estopenapi.gen.service;

import br.com.example.generated.estopenapi.ApiException;
import br.com.example.generated.estopenapi.api.GerenciamentoDeClientesApi;
import br.com.example.generated.estopenapi.model.ClientRequest;
import br.com.example.generated.estopenapi.model.ClientResponse;
import br.com.vmdos.estopenapi.gen.adapter.ClientRequestAdapter;
import br.com.vmdos.estopenapi.gen.adapter.ClientResponseAdapter;
import br.com.vmdos.estopenapi.gen.dto.ClientRequestDto;
import br.com.vmdos.estopenapi.gen.dto.ClientResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientService {

    private GerenciamentoDeClientesApi gerenciamentoDeClientesApi = new GerenciamentoDeClientesApi();

    @Autowired
    private ClientRequestAdapter clientRequestAdapter;

    @Autowired
    private ClientResponseAdapter clientResponseAdapter;

    public ClientResponseDto save(ClientRequestDto clientRequestDto) {

        ClientRequest from = clientRequestAdapter.from(clientRequestDto);

        try {
            ClientResponse response = gerenciamentoDeClientesApi.add(from);

            return clientResponseAdapter.from(response);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }

    }

}
