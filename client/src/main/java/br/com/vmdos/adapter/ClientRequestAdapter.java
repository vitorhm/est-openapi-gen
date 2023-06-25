package br.com.vmdos.adapter;

import br.com.example.generated.estopenapi.model.ClientRequest;
import br.com.vmdos.estopenapi.gen.dto.ClientRequestDto;

public class ClientRequestAdapter implements Adapter<ClientRequest, ClientRequestDto> {
    @Override
    public ClientRequest from(ClientRequestDto object) {

        ClientRequest clientRequest = new ClientRequest();
        clientRequest.setId(object.getId());
        clientRequest.setNome(object.getNome());

        return clientRequest;
    }
}
