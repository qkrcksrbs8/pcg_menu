package cg.park.pcg_menu.api.controllers;

import cg.park.pcg_menu.api.domain.Coffee;
import cg.park.pcg_menu.api.services.AmericanoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    AmericanoService americanoService;

    private static final Logger logger = LogManager.getLogger(MenuController.class);

    @GetMapping("")
    public Mono<List<Coffee>> index(ServerHttpRequest request, MenuController response) {
        logger.info("Menu signature Start");
        HttpHeaders headers = request.getHeaders();
        headers.forEach((k, v) -> {
            logger.info(k + " : " + v);
        });
        logger.info("Menu signature End");
        return Mono.just(americanoService.list());
    }

    @GetMapping("/test")
    public Mono<String> test(ServerHttpRequest request, MenuController response) {
        logger.info("Menu MicroService Start");
        HttpHeaders headers = request.getHeaders();
        headers.forEach((k, v) -> {
            logger.info(k + " : " + v);
        });
        logger.info("Menu MicroService End");

        return Mono.just("메뉴서비스 호출 테스트입니다.");
    }

    @GetMapping("/signature")
    public Mono<Coffee> getSignature(ServerHttpRequest request, MenuController response) {
        logger.info("Menu signature Start");
        Map map = request.getQueryParams();
        map.forEach((k, v) -> {
            logger.info(k + " : " + v);
        });
        logger.info("Menu signature End");
        return Mono.just(americanoService.signature());
    }

}
