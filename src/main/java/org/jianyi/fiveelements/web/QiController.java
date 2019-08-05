package org.jianyi.fiveelements.web;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.jianyi.fiveelements.domain.Qi;
import org.jianyi.fiveelements.service.QiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class QiController {

    @Autowired
    private QiService QiService;

    @ApiOperation(httpMethod = "POST", value = "新建QI信息")
    @ApiResponses({ @ApiResponse(message = "新建QI信息成功", response = Qi.class, code = 200),
            @ApiResponse(message = "新建QI信息失败", response = Qi.class, code = 500) })
    @PostMapping("/qi")
    public Mono<ResponseEntity<Qi>> add(@ApiParam("QI信息") @RequestBody Qi qi) {
        return QiService.save(qi).map( it ->  ResponseEntity.ok(it));
        //return Mono.justOrEmpty(ResponseEntity.ok(responseObject));
    }

    @ApiOperation(httpMethod = "PUT", value = "更新QI信息")
    @ApiResponses({ @ApiResponse(message = "更新QI信息成功", response = Qi.class, code = 200),
            @ApiResponse(message = "更新QI信息失败", response = Qi.class, code = 500) })
    @PutMapping("/qi")
    public Mono<ResponseEntity<Qi>> update(@ApiParam("QI信息") @RequestBody Qi qi) {
        return QiService.save(qi).map( it ->  ResponseEntity.ok(it));
        //return Mono.justOrEmpty(ResponseEntity.ok(responseObject));
    }

}
