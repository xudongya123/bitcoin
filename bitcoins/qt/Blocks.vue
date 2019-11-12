<template>
  <div class="hello">
    <el-table :data="blocks" style="width: 100%">
    <el-table-column prop="blockhash" label="哈希" width="180"></el-table-column>
    <el-table-column prop="confirmations" label="确认书" width="180"></el-table-column>
    <el-table-column prop="timestamp" label="开采时间" width="180"></el-table-column>
    <el-table-column prop="height" label="高度" width="180"></el-table-column>
    <el-table-column prop="miner" label="矿工" width="180"></el-table-column>
    <el-table-column prop="txnumber" label="交易数量" width="180"></el-table-column>
    <el-table-column prop="difficulty" label="困难" width="180"></el-table-column>
    <el-table-column prop="merkleroot" label="默克尔根" width="180"></el-table-column>
    <el-table-column prop="version" label="版" width="180"></el-table-column>
    <el-table-column prop="bits" label="位" width="180"></el-table-column>
    <el-table-column prop="weight" label="重量" width="180"></el-table-column>
    <el-table-column prop="size" label="尺寸" width="180"></el-table-column>
    <el-table-column prop="nonce" label="随机数" width="180"></el-table-column>
    <el-table-column prop="txvolume" label="交易量" width="180"></el-table-column>
    <el-table-column prop="blockreward" label="封锁奖励" width="180"></el-table-column>
    <el-table-column prop="feereward" label="费用奖励" width="180"></el-table-column>
    </el-table>
           <!-- {{blocks}} -->
          
  </div>
</template>

<script>
import axios from "../api/common";
export default {
  name: "HelloWorld",
  data() {
    return {
      blocks:[],
      
    };
  },
  methods: {
          getBlocks(){
             axios.get("/bitcoin/blocks").then(res=>{
                  this.blocks=res.data;
            })
          }
  },
  mounted() {

        this.getBlocks();
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
.a {
  background-color: red;
  color: #42b983;
}
</style>
