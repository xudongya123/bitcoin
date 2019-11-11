package com.xdy.bitcoin.controller;

import com.xdy.bitcoin.dao.BlockMapper;
import com.xdy.bitcoin.po.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/bitcoin")
public class BlockController {

    @Resource
    private BlockMapper blockMapper;

    @GetMapping("/blocks")
    public List<Block> blocks() {
        return blockMapper.blocks();
    }
     
    @GetMapping("/blockhash")
    public List<Block> blockhash(){
        return blockMapper.blockhash();
    }

}
