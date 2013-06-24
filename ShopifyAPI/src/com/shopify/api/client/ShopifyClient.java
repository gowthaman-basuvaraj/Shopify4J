package com.shopify.api.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;


import com.shopify.api.endpoints.ProductsService;
import com.shopify.api.resources.Product;
import org.codegist.crest.CRest;
import org.codegist.crest.CRestBuilder;
import org.codegist.crest.HttpClientRestService;

import com.shopify.api.APIAuthorization;
import com.shopify.api.credentials.Credential;
import com.shopify.api.endpoints.BaseShopifyService;
import com.shopify.api.endpoints.EndpointImpl;
import com.shopify.api.resources.ShopifyResource;
import com.shopify.api.resources.json.ShopifyRequestWriter;
import com.shopify.api.resources.json.ShopifyResponseReader;


public class ShopifyClient {
	private CRest crestClient;
	private APIAuthorization auth;
	private Credential creds;
	private ShopifyResponseReader reader = new ShopifyResponseReader();
	private ShopifyRequestWriter writer = new ShopifyRequestWriter();
	
	public ShopifyClient(Credential creds) {
		this.creds = creds;
		this.auth = new APIAuthorization(this.creds);
		crestClient = new CRestBuilder()
						.expectsJson()
						.setRestService(constructClientRestService())
						.overrideDefaultConfigWith(constructConfiguration())
						.build();
	}

	private HashMap<String, String> constructConfiguration(){
		return new HashMap<String, String>(){{
			put("service.end-point", getEndpoint());
		}};
	}
	
	private String getEndpoint() {
		return "https://"+creds.getShopName()+".myshopify.com";
	}
	
	private HttpClientRestService constructClientRestService() {
		return new HttpClientRestService(auth.getAuthorizedClient());
	}
	
	public <T extends BaseShopifyService> T constructService(Class<T> interfaze){
		if(interfaze.isInterface()) {
			return constructInterface(interfaze);
		} else {
			return constructEndpointImpl(interfaze);
		}
	}
	
	public <T extends BaseShopifyService> T constructInterface(Class<T> interfaze){
		return crestClient.build(interfaze);
	}
	
	public <T extends BaseShopifyService> T constructEndpointImpl(Class<T> clazz) {
		try {
			EndpointImpl instance = (EndpointImpl)clazz.newInstance();
			instance.setEndpoint(getEndpoint());
			instance.setHttpClient(auth.getAuthorizedClient());
			
			T service = constructService((Class<T>)instance.getServiceClass());
			instance.setServiceInterface(service);
			
			return (T) instance;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public <T extends ShopifyResource> List<T> handleResponse(InputStream in, Class<T> resource){
		return reader.read(new InputStreamReader(in), resource);
	}
	
	public <T extends ShopifyResource> String convertToJson(T object) throws IOException {
		StringWriter w = new StringWriter();
		writer.write(w, object);
		return w.toString();
	}

    //MASSIVE HACK ATTACK : SINCE "getProducts(String queryParams)" does not work
    public Product[] getProducts(ProductsService productsApi, int i){
        switch(i){
            case 1 :
                return productsApi.getProducts1();
            case 2 :
                return productsApi.getProducts2();
            case 3 :
                return productsApi.getProducts3();
            case 4 :
                return productsApi.getProducts4();
            case 5 :
                return productsApi.getProducts5();
            case 6 :
                return productsApi.getProducts6();
            case 7 :
                return productsApi.getProducts7();
            case 8 :
                return productsApi.getProducts8();
            case 9 :
                return productsApi.getProducts9();
            case 10 :
                return productsApi.getProducts10();
            case 11 :
                return productsApi.getProducts11();
            case 12 :
                return productsApi.getProducts12();
            case 13 :
                return productsApi.getProducts13();
            case 14 :
                return productsApi.getProducts14();
            case 15 :
                return productsApi.getProducts15();
            case 16 :
                return productsApi.getProducts16();
            case 17 :
                return productsApi.getProducts17();
            case 18 :
                return productsApi.getProducts18();
            case 19 :
                return productsApi.getProducts19();
            case 20 :
                return productsApi.getProducts20();
            case 21 :
                return productsApi.getProducts21();
            case 22 :
                return productsApi.getProducts22();
            case 23 :
                return productsApi.getProducts23();
            case 24 :
                return productsApi.getProducts24();
            case 25 :
                return productsApi.getProducts25();
            case 26 :
                return productsApi.getProducts26();
            case 27 :
                return productsApi.getProducts27();
            case 28 :
                return productsApi.getProducts28();
            case 29 :
                return productsApi.getProducts29();
            case 30 :
                return productsApi.getProducts30();
            case 31 :
                return productsApi.getProducts31();
            case 32 :
                return productsApi.getProducts32();
            case 33 :
                return productsApi.getProducts33();
            case 34 :
                return productsApi.getProducts34();
            case 35 :
                return productsApi.getProducts35();
            case 36 :
                return productsApi.getProducts36();
            case 37 :
                return productsApi.getProducts37();
            case 38 :
                return productsApi.getProducts38();
            case 39 :
                return productsApi.getProducts39();
            case 40 :
                return productsApi.getProducts40();
            case 41 :
                return productsApi.getProducts41();
            case 42 :
                return productsApi.getProducts42();
            case 43 :
                return productsApi.getProducts43();
            case 44 :
                return productsApi.getProducts44();
            case 45 :
                return productsApi.getProducts45();
            case 46 :
                return productsApi.getProducts46();
            case 47 :
                return productsApi.getProducts47();
            case 48 :
                return productsApi.getProducts48();
            case 49 :
                return productsApi.getProducts49();
            case 50 :
                return productsApi.getProducts50();
            case 51 :
                return productsApi.getProducts51();
            case 52 :
                return productsApi.getProducts52();
            case 53 :
                return productsApi.getProducts53();
            case 54 :
                return productsApi.getProducts54();
            case 55 :
                return productsApi.getProducts55();
            case 56 :
                return productsApi.getProducts56();
            case 57 :
                return productsApi.getProducts57();
            case 58 :
                return productsApi.getProducts58();
            case 59 :
                return productsApi.getProducts59();
            case 60 :
                return productsApi.getProducts60();
            case 61 :
                return productsApi.getProducts61();
            case 62 :
                return productsApi.getProducts62();
            case 63 :
                return productsApi.getProducts63();
            case 64 :
                return productsApi.getProducts64();
            case 65 :
                return productsApi.getProducts65();
            case 66 :
                return productsApi.getProducts66();
            case 67 :
                return productsApi.getProducts67();
            case 68 :
                return productsApi.getProducts68();
            case 69 :
                return productsApi.getProducts69();
            case 70 :
                return productsApi.getProducts70();
            case 71 :
                return productsApi.getProducts71();
            case 72 :
                return productsApi.getProducts72();
            case 73 :
                return productsApi.getProducts73();
            case 74 :
                return productsApi.getProducts74();
            case 75 :
                return productsApi.getProducts75();
            case 76 :
                return productsApi.getProducts76();
            case 77 :
                return productsApi.getProducts77();
            case 78 :
                return productsApi.getProducts78();
            case 79 :
                return productsApi.getProducts79();
            case 80 :
                return productsApi.getProducts80();
            case 81 :
                return productsApi.getProducts81();
            case 82 :
                return productsApi.getProducts82();
            case 83 :
                return productsApi.getProducts83();
            case 84 :
                return productsApi.getProducts84();
            case 85 :
                return productsApi.getProducts85();
            case 86 :
                return productsApi.getProducts86();
            case 87 :
                return productsApi.getProducts87();
            case 88 :
                return productsApi.getProducts88();
            case 89 :
                return productsApi.getProducts89();
            case 90 :
                return productsApi.getProducts90();
            case 91 :
                return productsApi.getProducts91();
            case 92 :
                return productsApi.getProducts92();
            case 93 :
                return productsApi.getProducts93();
            case 94 :
                return productsApi.getProducts94();
            case 95 :
                return productsApi.getProducts95();
            case 96 :
                return productsApi.getProducts96();
            case 97 :
                return productsApi.getProducts97();
            case 98 :
                return productsApi.getProducts98();
            case 99 :
                return productsApi.getProducts99();
            case 100 :
                return productsApi.getProducts100();
            case 101 :
                return productsApi.getProducts101();
            case 102 :
                return productsApi.getProducts102();
            case 103 :
                return productsApi.getProducts103();
            case 104 :
                return productsApi.getProducts104();
            case 105 :
                return productsApi.getProducts105();
            case 106 :
                return productsApi.getProducts106();
            case 107 :
                return productsApi.getProducts107();
            case 108 :
                return productsApi.getProducts108();
            case 109 :
                return productsApi.getProducts109();
            case 110 :
                return productsApi.getProducts110();
            case 111 :
                return productsApi.getProducts111();
            case 112 :
                return productsApi.getProducts112();
            case 113 :
                return productsApi.getProducts113();
            case 114 :
                return productsApi.getProducts114();
            case 115 :
                return productsApi.getProducts115();
            case 116 :
                return productsApi.getProducts116();
            case 117 :
                return productsApi.getProducts117();
            case 118 :
                return productsApi.getProducts118();
            case 119 :
                return productsApi.getProducts119();
            case 120 :
                return productsApi.getProducts120();
            case 121 :
                return productsApi.getProducts121();
            case 122 :
                return productsApi.getProducts122();
            case 123 :
                return productsApi.getProducts123();
            case 124 :
                return productsApi.getProducts124();
            case 125 :
                return productsApi.getProducts125();
            case 126 :
                return productsApi.getProducts126();
            case 127 :
                return productsApi.getProducts127();
            case 128 :
                return productsApi.getProducts128();
            case 129 :
                return productsApi.getProducts129();
            case 130 :
                return productsApi.getProducts130();
            case 131 :
                return productsApi.getProducts131();
            case 132 :
                return productsApi.getProducts132();
            case 133 :
                return productsApi.getProducts133();
            case 134 :
                return productsApi.getProducts134();
            case 135 :
                return productsApi.getProducts135();
            case 136 :
                return productsApi.getProducts136();
            case 137 :
                return productsApi.getProducts137();
            case 138 :
                return productsApi.getProducts138();
            case 139 :
                return productsApi.getProducts139();
            case 140 :
                return productsApi.getProducts140();
            case 141 :
                return productsApi.getProducts141();
            case 142 :
                return productsApi.getProducts142();
            case 143 :
                return productsApi.getProducts143();
            case 144 :
                return productsApi.getProducts144();
            case 145 :
                return productsApi.getProducts145();
            case 146 :
                return productsApi.getProducts146();
            case 147 :
                return productsApi.getProducts147();
            case 148 :
                return productsApi.getProducts148();
            case 149 :
                return productsApi.getProducts149();
            case 150 :
                return productsApi.getProducts150();
            case 151 :
                return productsApi.getProducts151();
            case 152 :
                return productsApi.getProducts152();
            case 153 :
                return productsApi.getProducts153();
            case 154 :
                return productsApi.getProducts154();
            case 155 :
                return productsApi.getProducts155();
            case 156 :
                return productsApi.getProducts156();
            case 157 :
                return productsApi.getProducts157();
            case 158 :
                return productsApi.getProducts158();
            case 159 :
                return productsApi.getProducts159();
            case 160 :
                return productsApi.getProducts160();
            case 161 :
                return productsApi.getProducts161();
            case 162 :
                return productsApi.getProducts162();
            case 163 :
                return productsApi.getProducts163();
            case 164 :
                return productsApi.getProducts164();
            case 165 :
                return productsApi.getProducts165();
            case 166 :
                return productsApi.getProducts166();
            case 167 :
                return productsApi.getProducts167();
            case 168 :
                return productsApi.getProducts168();
            case 169 :
                return productsApi.getProducts169();
            case 170 :
                return productsApi.getProducts170();
            case 171 :
                return productsApi.getProducts171();
            case 172 :
                return productsApi.getProducts172();
            case 173 :
                return productsApi.getProducts173();
            case 174 :
                return productsApi.getProducts174();
            case 175 :
                return productsApi.getProducts175();
            case 176 :
                return productsApi.getProducts176();
            case 177 :
                return productsApi.getProducts177();
            case 178 :
                return productsApi.getProducts178();
            case 179 :
                return productsApi.getProducts179();
            case 180 :
                return productsApi.getProducts180();
            case 181 :
                return productsApi.getProducts181();
            case 182 :
                return productsApi.getProducts182();
            case 183 :
                return productsApi.getProducts183();
            case 184 :
                return productsApi.getProducts184();
            case 185 :
                return productsApi.getProducts185();
            case 186 :
                return productsApi.getProducts186();
            case 187 :
                return productsApi.getProducts187();
            case 188 :
                return productsApi.getProducts188();
            case 189 :
                return productsApi.getProducts189();
            case 190 :
                return productsApi.getProducts190();
            case 191 :
                return productsApi.getProducts191();
            case 192 :
                return productsApi.getProducts192();
            case 193 :
                return productsApi.getProducts193();
            case 194 :
                return productsApi.getProducts194();
            case 195 :
                return productsApi.getProducts195();
            case 196 :
                return productsApi.getProducts196();
            case 197 :
                return productsApi.getProducts197();
            case 198 :
                return productsApi.getProducts198();
            case 199 :
                return productsApi.getProducts199();
            case 200 :
                return productsApi.getProducts200();
            case 201 :
                return productsApi.getProducts201();
            case 202 :
                return productsApi.getProducts202();
            case 203 :
                return productsApi.getProducts203();
            case 204 :
                return productsApi.getProducts204();
            case 205 :
                return productsApi.getProducts205();
            case 206 :
                return productsApi.getProducts206();
            case 207 :
                return productsApi.getProducts207();
            case 208 :
                return productsApi.getProducts208();
            case 209 :
                return productsApi.getProducts209();
            case 210 :
                return productsApi.getProducts210();
            case 211 :
                return productsApi.getProducts211();
            case 212 :
                return productsApi.getProducts212();
            case 213 :
                return productsApi.getProducts213();
            case 214 :
                return productsApi.getProducts214();
            case 215 :
                return productsApi.getProducts215();
            case 216 :
                return productsApi.getProducts216();
            case 217 :
                return productsApi.getProducts217();
            case 218 :
                return productsApi.getProducts218();
            case 219 :
                return productsApi.getProducts219();
            case 220 :
                return productsApi.getProducts220();
            case 221 :
                return productsApi.getProducts221();
            case 222 :
                return productsApi.getProducts222();
            case 223 :
                return productsApi.getProducts223();
            case 224 :
                return productsApi.getProducts224();
            case 225 :
                return productsApi.getProducts225();
            case 226 :
                return productsApi.getProducts226();
            case 227 :
                return productsApi.getProducts227();
            case 228 :
                return productsApi.getProducts228();
            case 229 :
                return productsApi.getProducts229();
            case 230 :
                return productsApi.getProducts230();
            case 231 :
                return productsApi.getProducts231();
            case 232 :
                return productsApi.getProducts232();
            case 233 :
                return productsApi.getProducts233();
            case 234 :
                return productsApi.getProducts234();
            case 235 :
                return productsApi.getProducts235();
            case 236 :
                return productsApi.getProducts236();
            case 237 :
                return productsApi.getProducts237();
            case 238 :
                return productsApi.getProducts238();
            case 239 :
                return productsApi.getProducts239();
            case 240 :
                return productsApi.getProducts240();
            case 241 :
                return productsApi.getProducts241();
            case 242 :
                return productsApi.getProducts242();
            case 243 :
                return productsApi.getProducts243();
            case 244 :
                return productsApi.getProducts244();
            case 245 :
                return productsApi.getProducts245();
            case 246 :
                return productsApi.getProducts246();
            case 247 :
                return productsApi.getProducts247();
            case 248 :
                return productsApi.getProducts248();
            case 249 :
                return productsApi.getProducts249();
            case 250 :
                return productsApi.getProducts250();
            case 251 :
                return productsApi.getProducts251();
            case 252 :
                return productsApi.getProducts252();
            case 253 :
                return productsApi.getProducts253();
            case 254 :
                return productsApi.getProducts254();
            case 255 :
                return productsApi.getProducts255();
            case 256 :
                return productsApi.getProducts256();
            case 257 :
                return productsApi.getProducts257();
            case 258 :
                return productsApi.getProducts258();
            case 259 :
                return productsApi.getProducts259();
            case 260 :
                return productsApi.getProducts260();
            case 261 :
                return productsApi.getProducts261();
            case 262 :
                return productsApi.getProducts262();
            case 263 :
                return productsApi.getProducts263();
            case 264 :
                return productsApi.getProducts264();
            case 265 :
                return productsApi.getProducts265();
            case 266 :
                return productsApi.getProducts266();
            case 267 :
                return productsApi.getProducts267();
            case 268 :
                return productsApi.getProducts268();
            case 269 :
                return productsApi.getProducts269();
            case 270 :
                return productsApi.getProducts270();
            case 271 :
                return productsApi.getProducts271();
            case 272 :
                return productsApi.getProducts272();
            case 273 :
                return productsApi.getProducts273();
            case 274 :
                return productsApi.getProducts274();
            case 275 :
                return productsApi.getProducts275();
            case 276 :
                return productsApi.getProducts276();
            case 277 :
                return productsApi.getProducts277();
            case 278 :
                return productsApi.getProducts278();
            case 279 :
                return productsApi.getProducts279();
            case 280 :
                return productsApi.getProducts280();
            case 281 :
                return productsApi.getProducts281();
            case 282 :
                return productsApi.getProducts282();
            case 283 :
                return productsApi.getProducts283();
            case 284 :
                return productsApi.getProducts284();
            case 285 :
                return productsApi.getProducts285();
            case 286 :
                return productsApi.getProducts286();
            case 287 :
                return productsApi.getProducts287();
            case 288 :
                return productsApi.getProducts288();
            case 289 :
                return productsApi.getProducts289();
            case 290 :
                return productsApi.getProducts290();
            case 291 :
                return productsApi.getProducts291();
            case 292 :
                return productsApi.getProducts292();
            case 293 :
                return productsApi.getProducts293();
            case 294 :
                return productsApi.getProducts294();
            case 295 :
                return productsApi.getProducts295();
            case 296 :
                return productsApi.getProducts296();
            case 297 :
                return productsApi.getProducts297();
            case 298 :
                return productsApi.getProducts298();
            case 299 :
                return productsApi.getProducts299();

            default :
                return productsApi.getProducts1();


        }
    }

}
