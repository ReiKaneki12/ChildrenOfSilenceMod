
package net.mcreator.childrenofsilence.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class ElvenCoffinNoSwordBlock extends Block {
	public ElvenCoffinNoSwordBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(-3.5, 0, -16, 19.5, 8, 32), box(17, 8, -15.5, 19, 16, 31.5), box(-3, 8, -15.5, -1, 16, 31.5), box(-1, 8, 29.5, 17, 16, 31.5), box(-1, 8, -15.5, 17, 16, -13.5), box(4, 8, 17, 12, 15, 25), box(4, 8, 5, 12, 11, 17),
				box(0, 10, 5, 4, 13, 17), box(12, 10, 5, 16, 13, 17), box(4, 8, -7, 8, 11, 5), box(8, 8, -7, 12, 11, 5));
	}
}
