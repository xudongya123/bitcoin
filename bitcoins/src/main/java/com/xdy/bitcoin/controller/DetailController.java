package com.xdy.bitcoin.controller;

import com.xdy.bitcoin.dao.DetailMapper;
import com.xdy.bitcoin.po.Detail;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/detail")
@CrossOrigin
public class DetailController {

    @Resource
    private DetailMapper detailMapper;

    @GetMapping("/getdetail")
    public List<Detail> getblocks(@RequestParam Integer detailid){
        List<Detail> details= detailMapper.getdetail(detailid);
        return details;
    }

    @GetMapping("/address")
    public List<Detail> getaddress(@RequestParam String address){
        List<Detail> addresss= detailMapper.getaddress(address);
        return addresss;
    }
}
