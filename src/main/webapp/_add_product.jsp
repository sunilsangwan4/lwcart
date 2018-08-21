<div class="col-md-6">
	<!-- general form elements -->
	<div class="box box-primary">
		<div class="box-header with-border">
			<h3 class="box-title">Add Product</h3>
			<h3 style="color: red;">${sucess}</h3>

		</div>
		<!-- /.box-header -->
		<!-- form start -->
		<form role="form"
			action="${pageContext.request.contextPath}/AddProduct" method="post"
			enctype="multipart/form-data">
			<div class="box-body">
				<div class="form-group">
					<label for="exampleInputEmail1">Product Code</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						placeholder="product code" name="product_code" required>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Product Description</label> <input
						type="text" class="form-control" id="exampleInputPassword1"
						placeholder="product description" name=" product_discription"
						required>
				</div>

				<div class="form-group">
					<label for="exampleInputPassword1">Select Category</label> <select
						name="category_name">


						<option value="">Please Select</option>

						<c:forEach items="${productCategories}" var="p">
							<option value="${p.id }">${p.categoryName }</option>
						</c:forEach>


					</select>
				</div>

				<div class="form-group">
					<label for="exampleInputPassword1">Product Price</label> <input
						type="text" class="form-control" id="exampleInputPassword1"
						placeholder="price " name=" product_price" required>
				</div>

				<div class="form-group">
					<label for="exampleInputFile">Upload Product Image</label> <input
						type="file" id="exampleInputFile" name="product_image" requried>

				</div>

			</div>
			<!-- /.box-body -->

			<div class="box-footer">
				<button type="submit" class="btn btn-primary">save</button>
			</div>
		</form>
	</div>
	<!-- /.box -->


</div>