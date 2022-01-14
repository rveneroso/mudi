package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Vitrola Chrome Light Blue com USB e Bluetooth, Bivolt");
		pedido.setValorNegociado(new BigDecimal(476.10));
		pedido.setDataDaEntrega(LocalDate.now());
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/413zC4KVpGL._AC_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Vitrola-Chrome-Light-Blue-Bluetooth/dp/B0819ZDDX8/?_encoding=UTF8&pd_rd_w=gNtqr&pf_rd_p=f4bc8501-341b-4441-baa7-6bdcbd2b1a48&pf_rd_r=YNA4ZVB60QW6D6VZT7YB&pd_rd_r=e24d979c-8117-4a86-afb9-95261a1e8648&pd_rd_wg=FKmNx&ref_=pd_gw_ci_mcx_mr_hp_atf_m");
		pedido.setDescricao("Descrição provisória");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
