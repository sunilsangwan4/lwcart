<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="./images/sunil.jpg" class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>${userName}</p>
				<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
			</div>
		</div>
		<!-- search form -->
		<form action="#" method="get" class="sidebar-form">
			<div class="input-group">
				<input type="text" name="q" class="form-control"
					placeholder="Search..."> <span class="input-group-btn">
					<button type="submit" name="search" id="search-btn"
						class="btn btn-flat">
						<i class="fa fa-search"></i>
					</button>
				</span>
			</div>
		</form>
		<!-- /.search form -->
		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu" data-widget="tree">




			<li class="treeview"><a href="#"> <i class="fa fa-laptop"></i>
					<span>Manage Product</span> <span class="pull-right-container">
						<i class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a
						href="${pageContext.request.contextPath}/ProductCategories"><i
							class="fa fa-circle-o"></i> Product categories</a></li>
					<li><a href="${pageContext.request.contextPath}/AddProduct"><i
							class="fa fa-circle-o"></i> AddProduct </a></li>

					<li><a href="${pageContext.request.contextPath}/Products"><i
							class="fa fa-circle-o"></i> Products </a></li>

					<li><a
						href="${pageContext.request.contextPath}/BrowseProducts"><i
							class="fa fa-circle-o"></i> Browse Products </a></li>




				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-edit"></i>
					<span>BuyProduct</span> <span class="pull-right-container">
						<i class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a href="${pageContext.request.contextPath}/BuyProduct"><i
							class="fa fa-circle-o"></i> BUY PRODUCT</a></li>

				</ul></li>





		</ul>
	</section>
	<!-- /.sidebar -->
</aside>