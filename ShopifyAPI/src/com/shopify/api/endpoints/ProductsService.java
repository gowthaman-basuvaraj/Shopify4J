/**
*
*
**/
// Generated On: 2011-09-01T02:13:38-04:00
package com.shopify.api.endpoints;

import java.util.List;

import org.codegist.crest.annotate.ContextPath;
import org.codegist.crest.annotate.Destination;
import org.codegist.crest.annotate.EndPoint;
import org.codegist.crest.annotate.HttpMethod;
import org.codegist.crest.annotate.Name;
import org.codegist.crest.annotate.ResponseHandler;
import org.codegist.crest.annotate.Path;

import static org.codegist.crest.HttpMethod.POST;
import static org.codegist.crest.HttpMethod.PUT;
import static org.codegist.crest.HttpMethod.DELETE;
import static org.codegist.crest.config.Destination.BODY;

import com.shopify.api.handlers.ShopifyResponseHandler;
import com.shopify.api.resources.Product;

@EndPoint("")
@ContextPath("/admin/products")
@ResponseHandler(ShopifyResponseHandler.class)
public interface ProductsService extends BaseShopifyService {

    // GET
    @Path(".json")
    Product[] getProducts();

    @Path(".json?{0}")
    Product[] getProducts(String queryParams);

    @Path("/{0}.json")
    Product getProduct(int id);

    @Path("/{0}.json?{1}")
    Product getProduct(int id, String queryParams);

    @Path("/count.json")
    int getCount();

    @Path("/count.json?{0}")
    int getCount(String queryParams);

    // POST
    @Path(".json")
    @HttpMethod(POST)
    Product createProduct(@Destination(BODY) @Name("product") Product product);

    // PUT
    @Path("/{0}.json")
    @HttpMethod(PUT)
    Product updateProduct(int id, @Destination(BODY) @Name("product") Product product);

    // DELETE
    @Path("/{0}.json")
    @HttpMethod(DELETE)
    void deleteProduct(int id);



    //MASSIVE HACK ATTACK : SINCE "getProducts(String queryParams)" does not work
    @Path(".json?limit=250&page=1")
    Product[] getProducts1();
    @Path(".json?limit=250&page=2")
    Product[] getProducts2();
    @Path(".json?limit=250&page=3")
    Product[] getProducts3();
    @Path(".json?limit=250&page=4")
    Product[] getProducts4();
    @Path(".json?limit=250&page=5")
    Product[] getProducts5();
    @Path(".json?limit=250&page=6")
    Product[] getProducts6();
    @Path(".json?limit=250&page=7")
    Product[] getProducts7();
    @Path(".json?limit=250&page=8")
    Product[] getProducts8();
    @Path(".json?limit=250&page=9")
    Product[] getProducts9();
    @Path(".json?limit=250&page=10")
    Product[] getProducts10();
    @Path(".json?limit=250&page=11")
    Product[] getProducts11();
    @Path(".json?limit=250&page=12")
    Product[] getProducts12();
    @Path(".json?limit=250&page=13")
    Product[] getProducts13();
    @Path(".json?limit=250&page=14")
    Product[] getProducts14();
    @Path(".json?limit=250&page=15")
    Product[] getProducts15();
    @Path(".json?limit=250&page=16")
    Product[] getProducts16();
    @Path(".json?limit=250&page=17")
    Product[] getProducts17();
    @Path(".json?limit=250&page=18")
    Product[] getProducts18();
    @Path(".json?limit=250&page=19")
    Product[] getProducts19();
    @Path(".json?limit=250&page=20")
    Product[] getProducts20();
    @Path(".json?limit=250&page=21")
    Product[] getProducts21();
    @Path(".json?limit=250&page=22")
    Product[] getProducts22();
    @Path(".json?limit=250&page=23")
    Product[] getProducts23();
    @Path(".json?limit=250&page=24")
    Product[] getProducts24();
    @Path(".json?limit=250&page=25")
    Product[] getProducts25();
    @Path(".json?limit=250&page=26")
    Product[] getProducts26();
    @Path(".json?limit=250&page=27")
    Product[] getProducts27();
    @Path(".json?limit=250&page=28")
    Product[] getProducts28();
    @Path(".json?limit=250&page=29")
    Product[] getProducts29();
    @Path(".json?limit=250&page=30")
    Product[] getProducts30();
    @Path(".json?limit=250&page=31")
    Product[] getProducts31();
    @Path(".json?limit=250&page=32")
    Product[] getProducts32();
    @Path(".json?limit=250&page=33")
    Product[] getProducts33();
    @Path(".json?limit=250&page=34")
    Product[] getProducts34();
    @Path(".json?limit=250&page=35")
    Product[] getProducts35();
    @Path(".json?limit=250&page=36")
    Product[] getProducts36();
    @Path(".json?limit=250&page=37")
    Product[] getProducts37();
    @Path(".json?limit=250&page=38")
    Product[] getProducts38();
    @Path(".json?limit=250&page=39")
    Product[] getProducts39();
    @Path(".json?limit=250&page=40")
    Product[] getProducts40();
    @Path(".json?limit=250&page=41")
    Product[] getProducts41();
    @Path(".json?limit=250&page=42")
    Product[] getProducts42();
    @Path(".json?limit=250&page=43")
    Product[] getProducts43();
    @Path(".json?limit=250&page=44")
    Product[] getProducts44();
    @Path(".json?limit=250&page=45")
    Product[] getProducts45();
    @Path(".json?limit=250&page=46")
    Product[] getProducts46();
    @Path(".json?limit=250&page=47")
    Product[] getProducts47();
    @Path(".json?limit=250&page=48")
    Product[] getProducts48();
    @Path(".json?limit=250&page=49")
    Product[] getProducts49();
    @Path(".json?limit=250&page=50")
    Product[] getProducts50();
    @Path(".json?limit=250&page=51")
    Product[] getProducts51();
    @Path(".json?limit=250&page=52")
    Product[] getProducts52();
    @Path(".json?limit=250&page=53")
    Product[] getProducts53();
    @Path(".json?limit=250&page=54")
    Product[] getProducts54();
    @Path(".json?limit=250&page=55")
    Product[] getProducts55();
    @Path(".json?limit=250&page=56")
    Product[] getProducts56();
    @Path(".json?limit=250&page=57")
    Product[] getProducts57();
    @Path(".json?limit=250&page=58")
    Product[] getProducts58();
    @Path(".json?limit=250&page=59")
    Product[] getProducts59();
    @Path(".json?limit=250&page=60")
    Product[] getProducts60();
    @Path(".json?limit=250&page=61")
    Product[] getProducts61();
    @Path(".json?limit=250&page=62")
    Product[] getProducts62();
    @Path(".json?limit=250&page=63")
    Product[] getProducts63();
    @Path(".json?limit=250&page=64")
    Product[] getProducts64();
    @Path(".json?limit=250&page=65")
    Product[] getProducts65();
    @Path(".json?limit=250&page=66")
    Product[] getProducts66();
    @Path(".json?limit=250&page=67")
    Product[] getProducts67();
    @Path(".json?limit=250&page=68")
    Product[] getProducts68();
    @Path(".json?limit=250&page=69")
    Product[] getProducts69();
    @Path(".json?limit=250&page=70")
    Product[] getProducts70();
    @Path(".json?limit=250&page=71")
    Product[] getProducts71();
    @Path(".json?limit=250&page=72")
    Product[] getProducts72();
    @Path(".json?limit=250&page=73")
    Product[] getProducts73();
    @Path(".json?limit=250&page=74")
    Product[] getProducts74();
    @Path(".json?limit=250&page=75")
    Product[] getProducts75();
    @Path(".json?limit=250&page=76")
    Product[] getProducts76();
    @Path(".json?limit=250&page=77")
    Product[] getProducts77();
    @Path(".json?limit=250&page=78")
    Product[] getProducts78();
    @Path(".json?limit=250&page=79")
    Product[] getProducts79();
    @Path(".json?limit=250&page=80")
    Product[] getProducts80();
    @Path(".json?limit=250&page=81")
    Product[] getProducts81();
    @Path(".json?limit=250&page=82")
    Product[] getProducts82();
    @Path(".json?limit=250&page=83")
    Product[] getProducts83();
    @Path(".json?limit=250&page=84")
    Product[] getProducts84();
    @Path(".json?limit=250&page=85")
    Product[] getProducts85();
    @Path(".json?limit=250&page=86")
    Product[] getProducts86();
    @Path(".json?limit=250&page=87")
    Product[] getProducts87();
    @Path(".json?limit=250&page=88")
    Product[] getProducts88();
    @Path(".json?limit=250&page=89")
    Product[] getProducts89();
    @Path(".json?limit=250&page=90")
    Product[] getProducts90();
    @Path(".json?limit=250&page=91")
    Product[] getProducts91();
    @Path(".json?limit=250&page=92")
    Product[] getProducts92();
    @Path(".json?limit=250&page=93")
    Product[] getProducts93();
    @Path(".json?limit=250&page=94")
    Product[] getProducts94();
    @Path(".json?limit=250&page=95")
    Product[] getProducts95();
    @Path(".json?limit=250&page=96")
    Product[] getProducts96();
    @Path(".json?limit=250&page=97")
    Product[] getProducts97();
    @Path(".json?limit=250&page=98")
    Product[] getProducts98();
    @Path(".json?limit=250&page=99")
    Product[] getProducts99();
    @Path(".json?limit=250&page=100")
    Product[] getProducts100();
    @Path(".json?limit=250&page=101")
    Product[] getProducts101();
    @Path(".json?limit=250&page=102")
    Product[] getProducts102();
    @Path(".json?limit=250&page=103")
    Product[] getProducts103();
    @Path(".json?limit=250&page=104")
    Product[] getProducts104();
    @Path(".json?limit=250&page=105")
    Product[] getProducts105();
    @Path(".json?limit=250&page=106")
    Product[] getProducts106();
    @Path(".json?limit=250&page=107")
    Product[] getProducts107();
    @Path(".json?limit=250&page=108")
    Product[] getProducts108();
    @Path(".json?limit=250&page=109")
    Product[] getProducts109();
    @Path(".json?limit=250&page=110")
    Product[] getProducts110();
    @Path(".json?limit=250&page=111")
    Product[] getProducts111();
    @Path(".json?limit=250&page=112")
    Product[] getProducts112();
    @Path(".json?limit=250&page=113")
    Product[] getProducts113();
    @Path(".json?limit=250&page=114")
    Product[] getProducts114();
    @Path(".json?limit=250&page=115")
    Product[] getProducts115();
    @Path(".json?limit=250&page=116")
    Product[] getProducts116();
    @Path(".json?limit=250&page=117")
    Product[] getProducts117();
    @Path(".json?limit=250&page=118")
    Product[] getProducts118();
    @Path(".json?limit=250&page=119")
    Product[] getProducts119();
    @Path(".json?limit=250&page=120")
    Product[] getProducts120();
    @Path(".json?limit=250&page=121")
    Product[] getProducts121();
    @Path(".json?limit=250&page=122")
    Product[] getProducts122();
    @Path(".json?limit=250&page=123")
    Product[] getProducts123();
    @Path(".json?limit=250&page=124")
    Product[] getProducts124();
    @Path(".json?limit=250&page=125")
    Product[] getProducts125();
    @Path(".json?limit=250&page=126")
    Product[] getProducts126();
    @Path(".json?limit=250&page=127")
    Product[] getProducts127();
    @Path(".json?limit=250&page=128")
    Product[] getProducts128();
    @Path(".json?limit=250&page=129")
    Product[] getProducts129();
    @Path(".json?limit=250&page=130")
    Product[] getProducts130();
    @Path(".json?limit=250&page=131")
    Product[] getProducts131();
    @Path(".json?limit=250&page=132")
    Product[] getProducts132();
    @Path(".json?limit=250&page=133")
    Product[] getProducts133();
    @Path(".json?limit=250&page=134")
    Product[] getProducts134();
    @Path(".json?limit=250&page=135")
    Product[] getProducts135();
    @Path(".json?limit=250&page=136")
    Product[] getProducts136();
    @Path(".json?limit=250&page=137")
    Product[] getProducts137();
    @Path(".json?limit=250&page=138")
    Product[] getProducts138();
    @Path(".json?limit=250&page=139")
    Product[] getProducts139();
    @Path(".json?limit=250&page=140")
    Product[] getProducts140();
    @Path(".json?limit=250&page=141")
    Product[] getProducts141();
    @Path(".json?limit=250&page=142")
    Product[] getProducts142();
    @Path(".json?limit=250&page=143")
    Product[] getProducts143();
    @Path(".json?limit=250&page=144")
    Product[] getProducts144();
    @Path(".json?limit=250&page=145")
    Product[] getProducts145();
    @Path(".json?limit=250&page=146")
    Product[] getProducts146();
    @Path(".json?limit=250&page=147")
    Product[] getProducts147();
    @Path(".json?limit=250&page=148")
    Product[] getProducts148();
    @Path(".json?limit=250&page=149")
    Product[] getProducts149();
    @Path(".json?limit=250&page=150")
    Product[] getProducts150();
    @Path(".json?limit=250&page=151")
    Product[] getProducts151();
    @Path(".json?limit=250&page=152")
    Product[] getProducts152();
    @Path(".json?limit=250&page=153")
    Product[] getProducts153();
    @Path(".json?limit=250&page=154")
    Product[] getProducts154();
    @Path(".json?limit=250&page=155")
    Product[] getProducts155();
    @Path(".json?limit=250&page=156")
    Product[] getProducts156();
    @Path(".json?limit=250&page=157")
    Product[] getProducts157();
    @Path(".json?limit=250&page=158")
    Product[] getProducts158();
    @Path(".json?limit=250&page=159")
    Product[] getProducts159();
    @Path(".json?limit=250&page=160")
    Product[] getProducts160();
    @Path(".json?limit=250&page=161")
    Product[] getProducts161();
    @Path(".json?limit=250&page=162")
    Product[] getProducts162();
    @Path(".json?limit=250&page=163")
    Product[] getProducts163();
    @Path(".json?limit=250&page=164")
    Product[] getProducts164();
    @Path(".json?limit=250&page=165")
    Product[] getProducts165();
    @Path(".json?limit=250&page=166")
    Product[] getProducts166();
    @Path(".json?limit=250&page=167")
    Product[] getProducts167();
    @Path(".json?limit=250&page=168")
    Product[] getProducts168();
    @Path(".json?limit=250&page=169")
    Product[] getProducts169();
    @Path(".json?limit=250&page=170")
    Product[] getProducts170();
    @Path(".json?limit=250&page=171")
    Product[] getProducts171();
    @Path(".json?limit=250&page=172")
    Product[] getProducts172();
    @Path(".json?limit=250&page=173")
    Product[] getProducts173();
    @Path(".json?limit=250&page=174")
    Product[] getProducts174();
    @Path(".json?limit=250&page=175")
    Product[] getProducts175();
    @Path(".json?limit=250&page=176")
    Product[] getProducts176();
    @Path(".json?limit=250&page=177")
    Product[] getProducts177();
    @Path(".json?limit=250&page=178")
    Product[] getProducts178();
    @Path(".json?limit=250&page=179")
    Product[] getProducts179();
    @Path(".json?limit=250&page=180")
    Product[] getProducts180();
    @Path(".json?limit=250&page=181")
    Product[] getProducts181();
    @Path(".json?limit=250&page=182")
    Product[] getProducts182();
    @Path(".json?limit=250&page=183")
    Product[] getProducts183();
    @Path(".json?limit=250&page=184")
    Product[] getProducts184();
    @Path(".json?limit=250&page=185")
    Product[] getProducts185();
    @Path(".json?limit=250&page=186")
    Product[] getProducts186();
    @Path(".json?limit=250&page=187")
    Product[] getProducts187();
    @Path(".json?limit=250&page=188")
    Product[] getProducts188();
    @Path(".json?limit=250&page=189")
    Product[] getProducts189();
    @Path(".json?limit=250&page=190")
    Product[] getProducts190();
    @Path(".json?limit=250&page=191")
    Product[] getProducts191();
    @Path(".json?limit=250&page=192")
    Product[] getProducts192();
    @Path(".json?limit=250&page=193")
    Product[] getProducts193();
    @Path(".json?limit=250&page=194")
    Product[] getProducts194();
    @Path(".json?limit=250&page=195")
    Product[] getProducts195();
    @Path(".json?limit=250&page=196")
    Product[] getProducts196();
    @Path(".json?limit=250&page=197")
    Product[] getProducts197();
    @Path(".json?limit=250&page=198")
    Product[] getProducts198();
    @Path(".json?limit=250&page=199")
    Product[] getProducts199();
    @Path(".json?limit=250&page=200")
    Product[] getProducts200();
    @Path(".json?limit=250&page=201")
    Product[] getProducts201();
    @Path(".json?limit=250&page=202")
    Product[] getProducts202();
    @Path(".json?limit=250&page=203")
    Product[] getProducts203();
    @Path(".json?limit=250&page=204")
    Product[] getProducts204();
    @Path(".json?limit=250&page=205")
    Product[] getProducts205();
    @Path(".json?limit=250&page=206")
    Product[] getProducts206();
    @Path(".json?limit=250&page=207")
    Product[] getProducts207();
    @Path(".json?limit=250&page=208")
    Product[] getProducts208();
    @Path(".json?limit=250&page=209")
    Product[] getProducts209();
    @Path(".json?limit=250&page=210")
    Product[] getProducts210();
    @Path(".json?limit=250&page=211")
    Product[] getProducts211();
    @Path(".json?limit=250&page=212")
    Product[] getProducts212();
    @Path(".json?limit=250&page=213")
    Product[] getProducts213();
    @Path(".json?limit=250&page=214")
    Product[] getProducts214();
    @Path(".json?limit=250&page=215")
    Product[] getProducts215();
    @Path(".json?limit=250&page=216")
    Product[] getProducts216();
    @Path(".json?limit=250&page=217")
    Product[] getProducts217();
    @Path(".json?limit=250&page=218")
    Product[] getProducts218();
    @Path(".json?limit=250&page=219")
    Product[] getProducts219();
    @Path(".json?limit=250&page=220")
    Product[] getProducts220();
    @Path(".json?limit=250&page=221")
    Product[] getProducts221();
    @Path(".json?limit=250&page=222")
    Product[] getProducts222();
    @Path(".json?limit=250&page=223")
    Product[] getProducts223();
    @Path(".json?limit=250&page=224")
    Product[] getProducts224();
    @Path(".json?limit=250&page=225")
    Product[] getProducts225();
    @Path(".json?limit=250&page=226")
    Product[] getProducts226();
    @Path(".json?limit=250&page=227")
    Product[] getProducts227();
    @Path(".json?limit=250&page=228")
    Product[] getProducts228();
    @Path(".json?limit=250&page=229")
    Product[] getProducts229();
    @Path(".json?limit=250&page=230")
    Product[] getProducts230();
    @Path(".json?limit=250&page=231")
    Product[] getProducts231();
    @Path(".json?limit=250&page=232")
    Product[] getProducts232();
    @Path(".json?limit=250&page=233")
    Product[] getProducts233();
    @Path(".json?limit=250&page=234")
    Product[] getProducts234();
    @Path(".json?limit=250&page=235")
    Product[] getProducts235();
    @Path(".json?limit=250&page=236")
    Product[] getProducts236();
    @Path(".json?limit=250&page=237")
    Product[] getProducts237();
    @Path(".json?limit=250&page=238")
    Product[] getProducts238();
    @Path(".json?limit=250&page=239")
    Product[] getProducts239();
    @Path(".json?limit=250&page=240")
    Product[] getProducts240();
    @Path(".json?limit=250&page=241")
    Product[] getProducts241();
    @Path(".json?limit=250&page=242")
    Product[] getProducts242();
    @Path(".json?limit=250&page=243")
    Product[] getProducts243();
    @Path(".json?limit=250&page=244")
    Product[] getProducts244();
    @Path(".json?limit=250&page=245")
    Product[] getProducts245();
    @Path(".json?limit=250&page=246")
    Product[] getProducts246();
    @Path(".json?limit=250&page=247")
    Product[] getProducts247();
    @Path(".json?limit=250&page=248")
    Product[] getProducts248();
    @Path(".json?limit=250&page=249")
    Product[] getProducts249();
    @Path(".json?limit=250&page=250")
    Product[] getProducts250();
    @Path(".json?limit=250&page=251")
    Product[] getProducts251();
    @Path(".json?limit=250&page=252")
    Product[] getProducts252();
    @Path(".json?limit=250&page=253")
    Product[] getProducts253();
    @Path(".json?limit=250&page=254")
    Product[] getProducts254();
    @Path(".json?limit=250&page=255")
    Product[] getProducts255();
    @Path(".json?limit=250&page=256")
    Product[] getProducts256();
    @Path(".json?limit=250&page=257")
    Product[] getProducts257();
    @Path(".json?limit=250&page=258")
    Product[] getProducts258();
    @Path(".json?limit=250&page=259")
    Product[] getProducts259();
    @Path(".json?limit=250&page=260")
    Product[] getProducts260();
    @Path(".json?limit=250&page=261")
    Product[] getProducts261();
    @Path(".json?limit=250&page=262")
    Product[] getProducts262();
    @Path(".json?limit=250&page=263")
    Product[] getProducts263();
    @Path(".json?limit=250&page=264")
    Product[] getProducts264();
    @Path(".json?limit=250&page=265")
    Product[] getProducts265();
    @Path(".json?limit=250&page=266")
    Product[] getProducts266();
    @Path(".json?limit=250&page=267")
    Product[] getProducts267();
    @Path(".json?limit=250&page=268")
    Product[] getProducts268();
    @Path(".json?limit=250&page=269")
    Product[] getProducts269();
    @Path(".json?limit=250&page=270")
    Product[] getProducts270();
    @Path(".json?limit=250&page=271")
    Product[] getProducts271();
    @Path(".json?limit=250&page=272")
    Product[] getProducts272();
    @Path(".json?limit=250&page=273")
    Product[] getProducts273();
    @Path(".json?limit=250&page=274")
    Product[] getProducts274();
    @Path(".json?limit=250&page=275")
    Product[] getProducts275();
    @Path(".json?limit=250&page=276")
    Product[] getProducts276();
    @Path(".json?limit=250&page=277")
    Product[] getProducts277();
    @Path(".json?limit=250&page=278")
    Product[] getProducts278();
    @Path(".json?limit=250&page=279")
    Product[] getProducts279();
    @Path(".json?limit=250&page=280")
    Product[] getProducts280();
    @Path(".json?limit=250&page=281")
    Product[] getProducts281();
    @Path(".json?limit=250&page=282")
    Product[] getProducts282();
    @Path(".json?limit=250&page=283")
    Product[] getProducts283();
    @Path(".json?limit=250&page=284")
    Product[] getProducts284();
    @Path(".json?limit=250&page=285")
    Product[] getProducts285();
    @Path(".json?limit=250&page=286")
    Product[] getProducts286();
    @Path(".json?limit=250&page=287")
    Product[] getProducts287();
    @Path(".json?limit=250&page=288")
    Product[] getProducts288();
    @Path(".json?limit=250&page=289")
    Product[] getProducts289();
    @Path(".json?limit=250&page=290")
    Product[] getProducts290();
    @Path(".json?limit=250&page=291")
    Product[] getProducts291();
    @Path(".json?limit=250&page=292")
    Product[] getProducts292();
    @Path(".json?limit=250&page=293")
    Product[] getProducts293();
    @Path(".json?limit=250&page=294")
    Product[] getProducts294();
    @Path(".json?limit=250&page=295")
    Product[] getProducts295();
    @Path(".json?limit=250&page=296")
    Product[] getProducts296();
    @Path(".json?limit=250&page=297")
    Product[] getProducts297();
    @Path(".json?limit=250&page=298")
    Product[] getProducts298();
    @Path(".json?limit=250&page=299")
    Product[] getProducts299();


}
