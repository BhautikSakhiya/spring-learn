package springMvcExampleSimpleValidation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/reservation")
public class ReservationController {
	@RequestMapping("/bookingForm")
	public String bookingform(Model model) {
		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);  
	    return "reservation-page";  
		
	}
}
