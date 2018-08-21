<section class="content">
	<div class="col-md-6">
		<!-- general form elements -->
		<div class="box box-primary">
			<div class="box-header with-border">
				<h3 class="box-title">Add Category</h3>
			<h4 style="color: red;">${error}</h4>
			<h4 style="color: green;">${sucess}</h4>
			</div>
			<!-- /.box-header -->
			<!-- form start -->
			<form role="form"
				action="${pageContext.request.contextPath}/AddProductCategory"
				method="post">
				<div class="box-body">
					<div class="form-group">
						<label for="exampleCategoryName">Category Name</label> <input
							type="text" class="form-control" id="exampleInputEmail1"
							placeholder="Category Name" name="category_name" required>
					</div>



				</div>
				<!-- /.box-body -->

				<div class="box-footer">
					<button type="submit" class="btn btn-primary">save</button>
				</div>
			</form>
		</div>




	</div>
</section>