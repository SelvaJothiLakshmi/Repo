package SpringNewPrject.SpringNewPrject1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedCfg {
	
	@Bean
	public Custom getBeans(){
		return new Custom(101,"customName");
		
	}
	
	@Bean
	public Address getAddressBeans(){
		return new Address("101A1","AddressName");
		
	}
	
	@Bean(name="addressAnno")
	public Address getAddressQulaiferBeans(){
		return new Address("101Qulaifier","customNameQualifier");
		
	}

}
