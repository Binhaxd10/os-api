package com.bruno.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.os.Cliente;
import com.bruno.os.Tecnico;
import com.bruno.os.domain.OS;
import com.bruno.os.domain.enuns.Prioridade;
import com.bruno.os.domain.enuns.Status;
import com.bruno.os.repositories.ClienteRepository;
import com.bruno.os.repositories.OSRepository;
import com.bruno.os.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Bruno Monteiro", "476.088.020-81", "(88) 98888-8888");
		Tecnico t2 = new Tecnico(null, "Maxwell Rodrigues", "327.038.640-00", "(88) 98888-6666");
		Cliente c1 = new Cliente(null, "Lucas Monteiro", "112.926.370-30", "(88) 98888-7777");
		Cliente c2 = new Cliente(null, "Rafael Monteiro", "949.521.050-08", "(88) 98888-2222");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		clienteRepository.saveAll(Arrays.asList(c1, c2));
		osRepository.saveAll(Arrays.asList(os1));
	}

}
