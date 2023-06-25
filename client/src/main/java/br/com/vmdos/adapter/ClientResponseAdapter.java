package br.com.vmdos.adapter;

import br.com.example.generated.estopenapi.model.ClientResponse;
import br.com.vmdos.estopenapi.gen.dto.ClientResponseDto;

public class ClientResponseAdapter implements Adapter<ClientResponseDto, ClientResponse> {
    @Override
    public ClientResponseDto from(ClientResponse object) {

        return new ClientResponseDto();
    }
}
