package br.com.caelum.estoque.ws;

import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService(endpointInterface="br.com.caelum.estoque.ws.EstoqueWS",  serviceName="EstoqueWS")
@Stateless
public class EstoqueWSImpl implements EstoqueWS{

	@Override
	public ListaItens todosOsItens(Filtros filtros) {
		// TODO Auto-generated method stub
		ListaItens lista = new ListaItens();
		Item item = new Item();
		item.setCodigo("123");
		item.setNome("Teste");
		item.setQuantidade(1);
		item.setTipo(TipoItem.CELULAR.value());
		lista.getItem().add(item);
		
		return lista;
	}

	@Override
	public CadastrarItemResponse cadastrarItem(CadastrarItem parameters, TokenUsuario tokenUsuario)
			throws AutorizacaoFault {
		// TODO Auto-generated method stub
		return null;
	}

}
