package br.com.vmdos.estopenapi.gen.adapter;

import br.com.example.generated.estopenapi.model.ClientResponse;
import br.com.vmdos.estopenapi.gen.dto.ClientResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ClientResponseAdapter implements Adapter<ClientResponseDto, ClientResponse> {
    @Override
    public ClientResponseDto from(ClientResponse object) {

        return new ClientResponseDto();
    }
}
