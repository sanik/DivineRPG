package naturix.divinerpg.dimensions.iceika.world;

import java.util.Random;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.registry.ModBlocks;
import naturix.divinerpg.world.WorldGenAPI;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRollumDungeon extends WorldGenerator {

	public boolean locationIsValidSpawn(World w, int x, int y, int z){
		for(int i = 0; i < 10; i++) {
			for(int l = 0; l < 10; l++) {
				if(w.getBlockState(new BlockPos(x + i, y, z + l)) != ModBlocks.stoneFrozen.getDefaultState()) {
					return false;
				}
			}
		}
		return true;
	}
	
	@Override
    public boolean generate(World w, Random rand, BlockPos pos) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		if(!locationIsValidSpawn(w, x, y, z)) return false;
		WorldGenAPI.addRectangle(6, 4, 5, w, x, y, z, ModBlocks.bricksIceika);
		WorldGenAPI.addRectangle(8, 8, 5, w, x + 5, y, z - 2, ModBlocks.bricksIceika);
		WorldGenAPI.addRectangle(8, 6, 3, w, x + 6, y + 1, z - 1, Blocks.AIR);
		WorldGenAPI.addRectangle(7, 2, 3, w, x, y + 1, z + 1, Blocks.AIR);
		WorldGenAPI.addRectangle(7, 2, 1, w, x, y, z + 1, ModBlocks.stoneIcy);
		WorldGenAPI.addRectangle(7, 8, 1, w, x + 5, y, z - 2, ModBlocks.stoneIcy);
		WorldGenAPI.addRectangle(1, 4, 4, w, x + 12, y, z - 1, ModBlocks.bricksIceika);
		WorldGenAPI.addRectangle(4, 4, 5, w, x + 13, y, z + 2, ModBlocks.bricksIceika);
		WorldGenAPI.addRectangle(4, 6, 5, w, x + 13, y, z + 3, ModBlocks.bricksIceika);
		WorldGenAPI.addRectangle(5, 2, 1, w, x + 12, y, z + 3, ModBlocks.stoneIcy);
		WorldGenAPI.addRectangle(2, 5, 3, w, x + 14, y + 1, z + 3, Blocks.AIR);
		WorldGenAPI.addRectangle(2, 5, 1, w, x + 14, y, z + 3, ModBlocks.stoneIcy);
		WorldGenAPI.addRectangle(1, 2, 3, w, x + 13, y + 1, z + 3, Blocks.AIR);
		WorldGenAPI.addRectangle(8, 4, 5, w, x + 16, y, z + 5, ModBlocks.bricksIceika);
		WorldGenAPI.addRectangle(7, 2, 3, w, x + 16, y + 1, z + 6, Blocks.AIR);
		WorldGenAPI.addRectangle(7, 2, 1, w, x + 16, y, z + 6, ModBlocks.stoneIcy);
		WorldGenAPI.addRectangle(4, 3, 5, w, x + 20, y, z + 3, ModBlocks.bricksIceika);
		WorldGenAPI.addRectangle(8, 8, 5, w, x + 18, y, z - 5, ModBlocks.bricksIceika);
		WorldGenAPI.addRectangle(6, 6, 3, w, x + 19, y + 1, z - 4, Blocks.AIR);
		WorldGenAPI.addRectangle(6, 6, 1, w, x + 19, y, z - 4, ModBlocks.stoneIcy);
		WorldGenAPI.addRectangle(2, 4, 3, w, x + 21, y + 1, z + 2, Blocks.AIR);
		WorldGenAPI.addRectangle(2, 4, 1, w, x + 21, y, z + 2, ModBlocks.stoneIcy);
		WorldGenAPI.addBlock(w, x + 20, y, z - 1, ModBlocks.spawnerRollum);
		WorldGenAPI.addBlock(w, x + 23, y, z - 1, ModBlocks.spawnerRollum);
		WorldGenAPI.addBlock(w, x + 8, y, z + 1, ModBlocks.spawnerRollum);
//		w.setBlockState(x + 24, y + 1, z - 4, ModBlocks.frostedChest, 1, 2);
//		w.setBlockState(x + 19, y + 1, z - 4, ModBlocks.frostedChest, 1, 2);
		WorldGenAPI.addRectangle(10, 2, 3, w, x - 5, y + 1, z + 1, Blocks.AIR);
        return true;
    }
}