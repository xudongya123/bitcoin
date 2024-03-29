package com.xdy.bitcoin.controller;

import com.xdy.bitcoin.dao.BlockMapper;
import com.xdy.bitcoin.po.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/bitcoin")
public class BlockController {
    @Resource
    private BlockMapper blockMapper;

    @GetMapping("/getblocks")
    public List<Block> getblocks(){
        List<Block> blocks=blockMapper.getblocks();
        return blocks;
    }

    @GetMapping("getblockhash")
    public Block getByblockHash(@RequestParam String blockhash){
        Block block= blockMapper.getblockhash(blockhash);
        return block;
    }




}
