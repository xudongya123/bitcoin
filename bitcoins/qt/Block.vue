<template>
  <div class="hello">
    <el-table :data="block" style="width: 100%">
      <el-table-column prop="height" label="高度" width="180">

           <template slot-scope="scope">
                    <!-- <el-button type="primary" @click="handleClick(scope)">{{scope.row.height}}</el-button> -->
                    <a :href="'http://localhost:8081/Blocks?blockhash=' + scope.row.height">{{scope.row.height}}</a>
                </template>       

      </el-table-column>
      <el-table-column prop="blockhash" label="哈希" width="180">

               <template slot-scope="scope">
                    <!-- <el-button type="primary" @click="handleClick(scope)">{{scope.row.height}}</el-button> -->
                    <a :href="'http://localhost:8081/Blocks?blockhash=' + scope.row.blockhash">{{scope.row.blockhash}}</a>
                </template>

      </el-table-column>
      <el-table-column prop="timestamp" label="开采时间" width="180"></el-table-column>
      <el-table-column prop="miner" label="矿工" width="180"></el-table-column>
      <el-table-column prop="size" label="尺寸" width="180"></el-table-column>
    </el-table>
  </div>
</template>

<script>
import axios from "../api/common";
export default {
  name: "HelloWorld",
  data() {
    return {
          block:[],
    };
  },
  methods: {
      getBlock(){
            axios.get("/bitcoin/blockhash").then(res=>{
                  this.block=res.data;
            })
      }
  },
  mounted() {
        this.getBlock();
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
