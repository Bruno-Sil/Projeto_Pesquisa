
package br.com.pesquisa.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import br.com.pesquisa.dao.FabricanteDAO;
import br.com.pesquisa.domain.Fabricante;
import br.com.pesquisa.util.JSFUtil;


public class FabricanteBean {
	private Fabricante fabricante;
	private ArrayList<Fabricante> itens;
	private ArrayList<Fabricante> itensFiltrados;

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public ArrayList<Fabricante> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Fabricante> itens) {
		this.itens = itens;
	}

	public ArrayList<Fabricante> getItensFiltrados() {
		return itensFiltrados;
	}

	public void setItensFiltrados(ArrayList<Fabricante> itensFiltrados) {
		this.itensFiltrados = itensFiltrados;
	}

	@PostConstruct
	public void prepararPesquisa() {
		try {
			FabricanteDAO dao = new FabricanteDAO();
			itens = dao.listar();

		} catch (SQLException ex) {
			ex.printStackTrace();
			JSFUtil.adicionarMensagemError(ex.getMessage());
		}
	}

	public void prepararNovo() {
		fabricante = new Fabricante();
	}

	public void novo() {
		try {
			FabricanteDAO dao = new FabricanteDAO();
			dao.salvar(fabricante);
			itens = dao.listar();

			JSFUtil.adicionarMensagemSucesso("Fabricante adicionado comm sucesso!");
		} catch (SQLException ex) {
			ex.printStackTrace();
			JSFUtil.adicionarMensagemError(ex.getMessage());
		}
	}

	public void excluir() {
		try {
			FabricanteDAO dao = new FabricanteDAO();
			dao.excluir(fabricante);

			itens = dao.listar();

			JSFUtil.adicionarMensagemSucesso("Fabricante removido com sucesso!");
		} catch (SQLException ex) {
			ex.printStackTrace();
			JSFUtil.adicionarMensagemError(ex.getMessage());
		}

	}

	public void editar() {
		try {
			FabricanteDAO dao = new FabricanteDAO();
			dao.editar(fabricante);

			itens = dao.listar();

			JSFUtil.adicionarMensagemSucesso("Fabricante editado com sucesso!");
		} catch (SQLException ex) {
			ex.printStackTrace();
			JSFUtil.adicionarMensagemError(ex.getMessage());
		}
	}
}

