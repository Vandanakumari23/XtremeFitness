package com.XtremeFitnessController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XtremeFitnessController {

		@RequestMapping(value = "/welcome")
		public String showHello(){
			System.out.println("*** Show Hello**");
			return "HomeDef";
		}
		
		@RequestMapping(value = "/about_us")
		public String showAboutUS(){
			System.out.println("*** showAboutUS**");
			return "AboutDef";
		}
		
		@RequestMapping(value = "/contactus")
		public String showContactUs(){
			System.out.println("*** showContactUs**");
			return "ContactDef";
		}
		
		@RequestMapping(value = "/FitnessShedule")
		public String showSHEDULE(){
			System.out.println("*** ShowSHEDULE**");
			return "SheduleDef";
		}
		
		@RequestMapping(value = "/FitnessShoping")
		public String showSHOPING(){
			System.out.println("*** Show SHOPING**");
			return "ShopingDef";
		}
		
		@RequestMapping(value = "/trainers")
		public String showTrainers(){
			System.out.println("*** Show Trainers**");
			return "TrainersDef";
		}
		
	}

