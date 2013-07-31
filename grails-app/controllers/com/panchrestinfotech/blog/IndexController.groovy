package com.panchrestinfotech.blog

class IndexController {

    def showHeader() { 
		render(view: 'header');
	}
	
	def showFooter() {
		render(view: 'footer');
	}
}
